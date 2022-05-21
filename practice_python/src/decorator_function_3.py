import time 
from logging import logger
from functools import wraps


def traced_function_wrong(function):
    logger.info("Running %s", function)
    start_time = time.time()

    @wraps(function)
    def wrapped(*args, **kwargs):
        result = function(*args, **kwargs)
        logger.info("runtime: %.2fs", function, time.time() - start_time)
        return result

    return wrapped

@traced_function_wrong
def process_with_delay(callback, delay=0):
    time.sleep(delay)
    return callback()

    