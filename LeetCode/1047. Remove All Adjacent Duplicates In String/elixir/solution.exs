defmodule Solution do
  @spec remove_duplicates(s :: String.t()) :: String.t()
  def remove_duplicates(s) do
    s
    |> to_charlist()
    |> recursive_remove_dup([])
    |> to_string()
    |> String.reverse()
  end

  defp recursive_remove_dup([], right) do
    right
  end

  defp recursive_remove_dup([h | l_t], [h | r_t]) do
    recursive_remove_dup(l_t, r_t)
  end

  defp recursive_remove_dup([l_h | l_t], right) do
    recursive_remove_dup(l_t, [l_h | right])
  end
end
