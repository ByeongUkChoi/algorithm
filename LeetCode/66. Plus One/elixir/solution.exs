defmodule Solution do
  @spec plus_one(digits :: [integer]) :: [integer]
  def plus_one(digits) do
    digits
    |> join_digits()
    |> Kernel.+(1)
    |> split_digits()
  end

  defp join_digits([h | rest]) do
    Enum.reduce(rest, h, fn num, acc -> acc * 10 + num end)
  end

  defp split_digits(n) do
    n
    |> Integer.to_string()
    |> String.graphemes()
    |> Enum.map(&String.to_integer/1)
  end
end
