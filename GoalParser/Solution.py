class Solution(object):
    def interpret(self, command):

        result=""
        for i in range(len(command)):
            if command[i] == "G":
                result += "G"
            elif command[i] =="(" and command [i+1] == ")":
                result += "o"

            elif command[i] == "(" and command[i+1] == "a" and command [i+2] == "l" and command [i+3] == ")":
                result+= "al"  
        return result

def test_code():
  lines = ["G()(al)", "G()()()()(al)", "(al)G(al)()()G"]

  for line in lines:
    solution = Solution()
    result = solution.interpret(line)
    print(result)

if __name__ == "__main__":
  test_code()
