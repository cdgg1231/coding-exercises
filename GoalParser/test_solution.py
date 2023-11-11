from Solution import Solution

def test_code():
  lines = ["G()(al)", "G()()()()(al)", "(al)G(al)()()G"]

  for line in lines:
    solution = Solution()
    result = solution.interpret(line)
    print(result)

if __name__ == "__main__":
  test_code()
