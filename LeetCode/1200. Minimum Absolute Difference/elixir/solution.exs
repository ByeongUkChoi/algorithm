defmodule Solution do
  @spec minimum_abs_difference(arr :: [integer]) :: [[integer]]
  def minimum_abs_difference(arr) do
    arr_with_diff =
      arr
      |> Enum.sort()
      |> Enum.chunk_every(2, 1)
      |> List.delete_at(-1)
      |> Enum.map(fn [a, b] -> {b - a, [a, b]} end)

    {min, _} = Enum.min(arr_with_diff)

    arr_with_diff
    |> Enum.filter(fn {diff, _} -> diff == min end)
    |> Enum.map(fn {_, arr} -> arr end)
  end
end
