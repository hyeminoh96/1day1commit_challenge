from logging import logger

class ControlledException(Exception):

    RETRIES_LIMIT = 3

    def with_retry(retries_limit=RETRIES_LIMIT, allowed_exceptions=None):
        allowed_exceptions = allowed_exceptions or (ControlledException,)

        def retry(operation):

            @wraps(operation)
            def wrapped(*args, **kwargs):
                last_raised = None    
                for _ in range(retries_limit):
                    try:
                        return operation(*args, **kwargs)
                    except ControlledException as e:
                        logger.info("retrying %s due to %s", operation, e)
                        last_raised = e
                raise last_raised

            return wrapped

        return retry

    @with_retry()
    def run_operation(task):
        return task.run()

    @with_retry(retries_limit = 5)
    def run_with_custom_retries_limit(task):
        return task.run()

    @with_retry(allowed_exceptions=(AttributeError,))
    def run_with_custom_exceptions(task):
        return task.run()

    @with_retry(retries_limit=4, allowed_exceptions=(ZeroDivisionError, AttributeError))
    def run_with_custom_parameters(task):
        return task.run()

    def trace_decorator(function):
        def wrapped(*args, **kwargs):
            logger.info("%s run", function.__qualname__)
            return function(*args, **kwargs)
        return wrapped

    @trace_decorator
    def process_account(account_id):
        """process by id"""
        logger.info("process id %s", account_id)


if __name__ == '__main__':
    help(ControlledException.process_account)