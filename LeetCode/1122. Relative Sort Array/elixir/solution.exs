defmodule Solution do
  @spec relative_sort_array(arr1 :: [integer], arr2 :: [integer]) :: [integer]
  def relative_sort_array(arr1, arr2) do
    sort_map = arr2 |> Enum.with_index() |> Map.new()
    Enum.sort_by(arr1, fn n -> Map.get(sort_map, n, 1000 + n) end)
  end
end
