defmodule Solution do
  @spec first_missing_positive(nums :: [integer]) :: integer
  def first_missing_positive(nums) do
    nums
    |> Enum.sort()
    |> find_missing_num()
  end

  defp find_missing_num(nums, acc \\ 1)

  defp find_missing_num([], acc) do
    acc
  end

  defp find_missing_num([h | t], acc) do
    acc = if h == acc, do: acc + 1, else: acc
    find_missing_num(t, acc)
  end
end
