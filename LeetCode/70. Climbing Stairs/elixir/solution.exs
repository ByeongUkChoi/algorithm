defmodule Solution do
  @spec climb_stairs(n :: integer) :: integer
  def climb_stairs(n), do: climb(n, 1, 0)
  defp climb(0, l, _), do: l
  defp climb(n, l, r), do: climb(n - 1, l + r, l)
end
