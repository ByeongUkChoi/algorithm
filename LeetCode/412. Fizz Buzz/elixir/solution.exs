defmodule Solution do
  @spec fizz_buzz(num :: integer) :: [String.t()]
  def fizz_buzz(num) do
    1..num
    |> Enum.map(fn
      n when rem(n, 15) == 0 -> "FizzBuzz"
      n when rem(n, 3) == 0 -> "Fizz"
      n when rem(n, 5) == 0 -> "Buzz"
      n -> Integer.to_string(n)
    end)
  end
end
