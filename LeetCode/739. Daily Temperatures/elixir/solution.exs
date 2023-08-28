defmodule Solution do
  @spec daily_temperatures(temperatures :: [integer]) :: [integer]
  def daily_temperatures(temperatures) do
    [head | rest] = Enum.with_index(temperatures)
    result = find_temp([head], rest)
    Enum.map(0..(length(temperatures) - 1), &Map.get(result, &1, 0))
  end

  defp find_temp(stack, visit, result \\ %{})
  defp find_temp(_stack, [], result), do: result
  defp find_temp([], [visit | rest], result), do: find_temp([visit], rest, result)

  defp find_temp([{top_v, top_i} | rest_s], [{visit_v, visit_i} | _] = visit, result)
       when top_v < visit_v,
       do: find_temp(rest_s, visit, Map.put(result, top_i, visit_i - top_i))

  defp find_temp(stack, [visit | rest], result), do: find_temp([visit | stack], rest, result)
end
