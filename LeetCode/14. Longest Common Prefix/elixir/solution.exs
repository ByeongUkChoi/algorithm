defmodule Solution do
  @spec longest_common_prefix(strs :: [String.t()]) :: String.t()
  def longest_common_prefix(strs) do
    strs
    |> Enum.map(&String.to_charlist/1)
    |> Enum.zip_with(& &1)
    |> Enum.map(&Enum.uniq/1)
    |> Enum.reduce_while('', fn
      [a], acc -> {:cont, [a | acc]}
      _, acc -> {:halt, acc}
    end)
    |> Enum.reverse()
    |> to_string()
  end
end
