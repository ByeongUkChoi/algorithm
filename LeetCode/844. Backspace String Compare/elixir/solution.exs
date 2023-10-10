defmodule Solution do
  @spec backspace_compare(s :: String.t(), t :: String.t()) :: boolean
  def backspace_compare(s, t) do
    run_backspace(s) == run_backspace(t)
  end

  defp run_backspace(s) do
    s
    |> to_charlist()
    |> Enum.reduce([], fn c, acc ->
      if c == ?# do
        if acc == [], do: [], else: tl(acc)
      else
        [c | acc]
      end
    end)
    |> Enum.reverse()
    |> to_string()
  end
end
