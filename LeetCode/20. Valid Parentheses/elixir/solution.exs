defmodule Solution do
  @spec is_valid(s :: String.t()) :: boolean
  def is_valid(s) do
    s
    |> to_charlist()
    |> valid_parentheses()
  end

  defp valid_parentheses(chars, stack \\ [])

  defp valid_parentheses([], stack) do
    stack == []
  end

  defp valid_parentheses([h | t], []) do
    valid_parentheses(t, [h])
  end

  defp valid_parentheses([h | t], [top | rest] = stack) do
    if is_complete_brackets(h, top) do
      valid_parentheses(t, rest)
    else
      valid_parentheses(t, [h | stack])
    end
  end

  defp is_complete_brackets(a, b) do
    case {b, a} do
      {?(, ?)} -> true
      {?{, ?}} -> true
      {?[, ?]} -> true
      _ -> false
    end
  end
end
