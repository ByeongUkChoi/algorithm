defmodule Solution do
  @spec is_palindrome(x :: integer) :: boolean
  def is_palindrome(x) do
    x |> to_string() |> then(&(&1 == String.reverse(&1)))
  end
end
