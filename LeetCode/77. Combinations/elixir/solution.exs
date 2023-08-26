defmodule Solution do
  @spec combine(n :: integer, k :: integer) :: [[integer]]
  def combine(n, k) do
    comb(k, Enum.to_list(1..n))
  end

  defp comb(0, _), do: [[]]
  defp comb(_, []), do: []
  defp comb(m, [h | t]), do: for(l <- comb(m - 1, t), do: [h | l]) ++ comb(m, t)
end
