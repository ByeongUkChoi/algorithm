defmodule Solution do
  @spec buddy_strings(s :: String.t(), goal :: String.t()) :: boolean
  def buddy_strings(s, goal) do
    sc = to_charlist(s)
    gc = to_charlist(goal)

    if length(sc) == length(gc) do
      Enum.zip(sc, gc)
      |> Enum.filter(fn {scc, gcc} -> scc != gcc end)
      |> case do
        [] -> sc |> Enum.frequencies() |> Enum.any?(&(elem(&1, 1) > 1))
        [{a, b}, {b, a}] -> true
        _ -> false
      end
    else
      false
    end
  end
end
