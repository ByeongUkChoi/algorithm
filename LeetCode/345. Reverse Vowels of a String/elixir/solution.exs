defmodule Solution do
  @spec reverse_vowels(s :: String.t()) :: String.t()
  def reverse_vowels(s) do
    chars_with_index = s |> to_charlist() |> Enum.with_index()

    reverse_index_map =
      chars_with_index
      |> Enum.filter(&(elem(&1, 0) in [?a, ?e, ?i, ?o, ?u, ?A, ?E, ?I, ?O, ?U]))
      |> Enum.map(&elem(&1, 1))
      |> then(fn vowels ->
        vowels
        |> Enum.reverse()
        |> Enum.zip(vowels)
        |> Enum.into(%{})
      end)

    index_char_map = Map.new(chars_with_index, fn {c, i} -> {i, c} end)

    chars_with_index
    |> Enum.map(fn {c, i} ->
      if reverse_idx = Map.get(reverse_index_map, i) do
        Map.get(index_char_map, reverse_idx)
      else
        c
      end
    end)
    |> to_string()
  end
end
