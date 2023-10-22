defmodule Solution do
  @spec sum_odd_length_subarrays(arr :: [integer]) :: integer
  def sum_odd_length_subarrays(arr) do
    1..length(arr)
    |> Enum.to_list()
    |> Enum.filter(&(rem(&1, 2) == 1))
    |> Enum.reduce(0, fn c, acc ->
      arr
      |> Enum.chunk_every(c, 1, :discard)
      |> Enum.flat_map(& &1)
      |> Enum.sum()
      |> Kernel.+(acc)
    end)
  end
end
