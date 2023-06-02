defmodule Solution do
  @spec max_area(height :: [integer]) :: integer
  def max_area(height) do
    height_map = height |> Enum.with_index() |> Map.new(fn {v, i} -> {i, v} end)

    get_max_area(height_map, 0, map_size(height_map) - 1, 0)
  end

  defp get_max_area(_height_map, p, p, max_area) do
    max_area
  end

  defp get_max_area(height_map, left, right, max_area) do
    width = right - left
    left_height = height_map[left]
    right_height = height_map[right]
    height = min(left_height, right_height)
    max_area = max(max_area, width * height)

    if left_height > right_height do
      get_max_area(height_map, left, right - 1, max_area)
    else
      get_max_area(height_map, left + 1, right, max_area)
    end
  end
end
