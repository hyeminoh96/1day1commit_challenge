def solution(n, k, cmd):
    answer = ['O' for i in range(n)]
    act_ar = ['O' for i in range(n)]
    deleted = []
    idx = k
    
    for i in cmd:
        if str(i).startswith('U'): # x개 위 선택
            num = i[-1]
            idx = idx - int(num)
        if str(i).startswith('D'): # x개 아래 선택
            num = i[-1]
            idx = idx + int(num)
        if str(i).startswith('C'):
            answer[idx]='X' # 현재 인덱스 x 표시
            del act_ar[idx] # 실제 arr에서 삭제
            deleted.append(idx) # 삭제기록에 남기기
            # 다음 인덱스 선택
            if idx == n: # 마지막 행이면 위 선택
                idx = idx - 1
            else: # 마지막 행이 아니면 아래 선택
                idx = idx + 1
                
        if str(i).startswith('Z'): # 이전 삭제 복구
            recover = deleted[-1]
            answer[recover] = 'O'
            act_ar.append('0')
            del deleted[-1]
    answer = ''.join(answer)
    return answer