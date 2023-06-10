defmodule Solution do
  @spec generate_parenthesis(n :: integer) :: [String.t()]
  def generate_parenthesis(n) do
    n = n * 2

    0..trunc(2 ** n - 1)
    |> Enum.map(fn x ->
      Integer.to_string(x, 2)
      |> String.replace(["0", "1"], fn
        "0" -> "("
        "1" -> ")"
      end)
      |> String.pad_leading(n, "(")
    end)
    |> Enum.filter(&is_valid/1)
  end

  defp is_valid(s) do
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
