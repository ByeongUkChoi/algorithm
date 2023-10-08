defmodule Solution do
  @spec reverse_only_letters(s :: String.t()) :: String.t()
  def reverse_only_letters(s) do
    str_list = String.graphemes(s)

    reversed_str_queue =
      str_list |> Enum.reverse() |> Enum.filter(fn s -> String.match?(s, ~r/^[a-zA-Z]$/) end)

    str_list
    |> Enum.reduce([acc: [], queue: reversed_str_queue], fn s, [acc: acc, queue: queue] ->
      if String.match?(s, ~r/^[a-zA-Z]$/) do
        [h | t] = queue
        [acc: [h | acc], queue: t]
      else
        [acc: [s | acc], queue: queue]
      end
    end)
    |> Keyword.get(:acc)
    |> Enum.reverse()
    |> Enum.join()
  end
end
