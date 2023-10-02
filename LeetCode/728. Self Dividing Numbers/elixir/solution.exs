defmodule Solution do
  @spec self_dividing_numbers(left :: integer, right :: integer) :: [integer]
  def self_dividing_numbers(left, right) do
    Enum.filter(left..right, &self_diving?/1)
  end

  defp self_diving?(num) do
    num
    |> num_to_digits()
    |> Enum.all?(&(&1 != 0 and rem(num, &1) == 0))
  end

  defp num_to_digits(num, acc \\ [])
  defp num_to_digits(0, acc), do: acc
  defp num_to_digits(num, acc), do: num_to_digits(div(num, 10), [rem(num, 10) | acc])
end
