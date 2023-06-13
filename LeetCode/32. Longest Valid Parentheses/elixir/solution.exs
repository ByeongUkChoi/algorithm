defmodule Solution do
  @spec longest_valid_parentheses(s :: String.t()) :: integer
  def longest_valid_parentheses(s) do
    s
    |> to_charlist()
    |> Enum.map(fn
      ?( -> 1
      ?) -> -1
    end)
    |> get_max_parentheses_length()
  end

  defp get_max_parentheses_length(list, max_length \\ 0)

  defp get_max_parentheses_length([], max_length) do
    max_length
  end

  defp get_max_parentheses_length([_ | t] = list, max_length) do
    current_max_length = max_parentheses_length(list)
    max_length = max(current_max_length, max_length)
    get_max_parentheses_length(t, max_length)
  end

  defp max_parentheses_length(list, acc_val \\ 0, current_length \\ 1, max_length \\ 0)

  defp max_parentheses_length([h | t], acc_val, current_length, max_length)
       when h + acc_val >= 0 do
    max_length = if h + acc_val == 0, do: current_length, else: max_length
    max_parentheses_length(t, h + acc_val, current_length + 1, max_length)
  end

  defp max_parentheses_length(_list, _acc_val, _current_length, max_length) do
    max_length
  end
end
