# https://school.programmers.co.kr/learn/courses/30/lessons/42586#qna

import math

def solution(progresses, speeds):
    answer = []
    days = []
    n = len(progresses)
    
    for i in range(n):
        days.append(math.ceil((100-progresses[i]) / speeds[i]))
    
    cnt = 1
    d = days[0]
    for i in range(1, n):
        if d >= days[i]:
            cnt += 1
        else:
            answer.append(cnt)
            cnt = 1
            d = days[i]
        
    answer.append(cnt)
    return answer
