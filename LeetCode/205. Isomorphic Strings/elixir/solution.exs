defmodule Solution do
  @spec is_isomorphic(s :: String.t(), t :: String.t()) :: boolean
  def is_isomorphic(s, t) do
    scs = to_charlist(s)
    tcs = to_charlist(t)

    char_map =
      scs
      |> Enum.zip(tcs)
      |> Enum.reduce(%{}, fn {sc, tc}, acc ->
        Map.put_new(acc, sc, tc)
      end)
      |> Map.new(fn {key, val} -> {val, key} end)

    tcs
    |> Enum.map(&Map.get(char_map, &1))
    |> then(&(&1 == scs))
  end
end
