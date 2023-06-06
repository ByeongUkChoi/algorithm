defmodule Solution do
  @spec letter_combinations(digits :: String.t()) :: [String.t()]
  def letter_combinations("") do
    []
  end

  def letter_combinations(digits) do
    digits
    |> to_charlist()
    |> Enum.reverse()
    |> Enum.map(&get_phone_nums/1)
    |> combination([], [])
  end

  defp get_phone_nums(char) do
    case char do
      ?2 -> ['a', 'b', 'c']
      ?3 -> ['d', 'e', 'f']
      ?4 -> ['g', 'h', 'i']
      ?5 -> ['j', 'k', 'l']
      ?6 -> ['m', 'n', 'o']
      ?7 -> ['p', 'q', 'r', 's']
      ?8 -> ['t', 'u', 'v']
      ?9 -> ['w', 'x', 'y', 'z']
    end
  end

  defp combination([], tmp, acc) do
    [to_string(tmp) | acc]
  end

  defp combination([h | t], tmp, acc) do
    Enum.flat_map(h, fn char ->
      combination(t, [char | tmp], acc)
    end)
  end
end
