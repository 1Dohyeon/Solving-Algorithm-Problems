# 땅 위에 달팽이가 있다. 
# 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
# 달팽이는 낮에 A미터 올라갈 수 있다. 
# 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다. 
# 또, 정상에 올라간 후에는 미끄러지지 않는다.
# 달팽이가 나무 막대를 모두 올라가려면, 
# 며칠이 걸리는지 구하는 프로그램을 작성하시오.

import sys

# 반복문으로 여러 줄을 입력받을 때는 sys.stdin.readline()이 좋은듯...
a, b, v = map(int, sys.stdin.readline().split())

# 방정식을 구해도 되지만 반복문을 이용해도 될듯
# day = 1 # 날짜
# dist = 0 # 이동거리
# while(True):
#     dist += a
#     if(dist >= v): 
#         print(day)
#         break
#     else: dist -= b
#     day += 1
# 반복문을 사용하니 시간이 초과됨 -> 주석 처리 후 방정식 이용

# a-b + a-b + ... + a >= v 를 만족해야함.
# a-b 한 주기가 하루이고, 마지막 a가 하루임
# 따라서 day*a - (day-1)*b >= v 이므로, day >= (v-b)/(a-b)
day = (v-b)/(a-b)
if(day==int(day)): print(int(day))
else: print(int(day) + 1)