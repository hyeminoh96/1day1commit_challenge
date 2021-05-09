# 문제 1

def solution(s):
    import re
    
    alpha_all = {'z','e','r','o','n','t','w','h','f','u','i','v','s','x','g'}
    
    tr_dict = {"zero":0,"one":1,"two":2,"three":3,"four":4,"five":5,"six":6,"seven":7,"eight":8,"nine":9}
    
    cut = list(s)
    answer = ''
    tmp = ''
    for i in cut:
        if i in alpha_all: # 해당 문자가 알파벳
            tmp = tmp + i
            if tmp in tr_dict: # 알파벳의 모음이 변환 딕에 있으면 
                answer = answer + str(tr_dict.get(tmp))
                tmp = ''
            
        else: # 해당 문자가 숫자 
            answer = answer + i
    answer = int(answer)
    return answer
