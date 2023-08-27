defmodule Solution do
  @spec can_jump(nums :: [integer]) :: boolean
  def can_jump([head | rest] = _nums), do: jump(rest, head - 1)

  defp jump([], _reach), do: true
  defp jump(_nums, reach) when reach < 0, do: false
  defp jump([h | t], reach), do: jump(t, max(h, reach) - 1)
end
