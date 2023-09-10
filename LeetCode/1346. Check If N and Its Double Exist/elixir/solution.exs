defmodule Solution do
  @spec check_if_exist(arr :: [integer]) :: boolean
  def check_if_exist(arr) do
    map_set = MapSet.new(arr)
    Enum.any?(arr, &check_if_exist(&1, map_set, arr))
  end

  defp check_if_exist(0, _map_set, arr) do
    Enum.count(arr, &(&1 == 0)) > 1
  end

  defp check_if_exist(target, map_set, _arr) do
    MapSet.member?(map_set, target * 2)
  end
end
