def solution(arr):
'''정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.'''
    answer = 0
    a = 0
    for i in range(len(arr)):
        a = a + arr[i] 
    answer = a / (len(arr))
    return answer