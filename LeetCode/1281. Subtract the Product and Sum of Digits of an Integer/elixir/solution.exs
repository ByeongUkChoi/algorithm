defmodule Solution do
  @spec subtract_product_and_sum(n :: integer) :: integer
  def subtract_product_and_sum(n) do
    digits = to_digits(n)
    mul(digits) - sum(digits)
  end

  defp to_digits(n, acc \\ [])
  defp to_digits(0, acc), do: acc
  defp to_digits(n, acc), do: to_digits(div(n, 10), [rem(n, 10) | acc])

  defp mul(nums), do: Enum.reduce(nums, fn num, acc -> num * acc end)
  defp sum(nums), do: Enum.reduce(nums, fn num, acc -> num + acc end)
end
