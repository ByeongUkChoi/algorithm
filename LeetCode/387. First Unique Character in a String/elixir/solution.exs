defmodule Solution do
  @spec first_uniq_char(s :: String.t()) :: integer
  def first_uniq_char(s) do
    chars = to_charlist(s)

    uniq_chars =
      chars
      |> Enum.frequencies()
      |> Enum.filter(&(elem(&1, 1) == 1))
      |> Enum.map(&elem(&1, 0))

    chars
    |> Enum.with_index()
    |> Enum.find_value(-1, fn {c, i} -> c in uniq_chars and i end)
  end
end
