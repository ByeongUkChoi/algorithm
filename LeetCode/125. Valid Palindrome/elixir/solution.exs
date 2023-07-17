defmodule Solution do
  @spec is_palindrome(s :: String.t()) :: boolean
  def is_palindrome(s) do
    str = s |> String.downcase() |> String.replace(~r/[^a-z0-9]/, "")
    str == String.reverse(str)
  end
end
