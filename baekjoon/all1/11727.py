# 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.

# dp = [0, 1, 3]
# n = int(input())

# for i in range(3,n+1):
#     dp.append(dp[i-1]+2*dp[i-2])

# print(dp[n])



def solution(n, dp={}):
    if n in dp:
        return dp[n]
    if n==1: 
        return 1
    if n==2:
        return 3

    dp[n] = (solution(n-1, dp)+2*solution(n-2, dp))
    return dp[n]

n = int(input())
print(solution(n)%10007)
