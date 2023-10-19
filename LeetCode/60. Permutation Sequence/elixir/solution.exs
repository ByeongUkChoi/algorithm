defmodule Solution do
  @spec get_permutation(n :: integer, k :: integer) :: String.t()
  def get_permutation(n, k) do
    nums = Enum.to_list(1..n)

    n..1
    |> Enum.reduce([nums: nums, k: k - 1, acc: []], fn n, nums: nums, k: k, acc: acc ->
      f = factorial(n - 1)
      i = div(k, f)
      {num, new_nums} = List.pop_at(nums, i)
      new_k = rem(k, f)
      [nums: new_nums, k: new_k, acc: [num | acc]]
    end)
    |> Keyword.get(:acc)
    |> Enum.reverse()
    |> Enum.join()
  end

  defp factorial(0), do: 1
  defp factorial(n) when n > 0, do: Enum.reduce(1..n, &*/2)
end
