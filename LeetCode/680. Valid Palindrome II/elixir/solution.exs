defmodule Solution do
  @spec valid_palindrome(s :: String.t()) :: boolean
  def valid_palindrome(s) do
    chars = to_charlist(s)
    reversed_chars = Enum.reverse(chars)

    diff_index =
      chars
      |> Enum.zip(reversed_chars)
      |> Enum.find_index(fn {c1, c2} ->
        c1 != c2
      end)

    if diff_index == nil do
      true
    else
      chars |> List.delete_at(diff_index) |> palindroms?() ||
        reversed_chars |> List.delete_at(diff_index) |> palindroms?()
    end
  end

  defp palindroms?(l), do: Enum.reverse(l) == l
end
