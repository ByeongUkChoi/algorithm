defmodule Solution do
  @spec add_digits(num :: integer) :: integer
  def add_digits(num) do
    num
    |> to_digits()
    |> sum_digits()
  end

  defp to_digits(num) do
    num |> to_string() |> String.codepoints() |> Enum.map(&String.to_integer/1)
  end

  defp sum_digits([num]) do
    num
  end

  defp sum_digits(nums) do
    nums |> Enum.sum() |> to_digits() |> sum_digits()
  end
end
