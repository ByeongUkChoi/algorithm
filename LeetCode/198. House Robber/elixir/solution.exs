defmodule Solution do
  @spec rob(nums :: [integer]) :: integer
  def rob([h | t]) do
    dp(t, h, 0)
  end

  defp dp([], dp_visited, dp_non_visited) do
    max(dp_visited, dp_non_visited)
  end

  defp dp([num | rest], dp_visited, dp_non_visited) do
    dp(rest, dp_non_visited + num, max(dp_visited, dp_non_visited))
  end
end
