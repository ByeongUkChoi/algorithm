defmodule Solution do
  @spec is_subsequence(s :: String.t(), t :: String.t()) :: boolean
  def is_subsequence(s, t) do
    is_subsequence?(to_charlist(s), to_charlist(t))
  end

  defp is_subsequence?([], _) do
    true
  end

  defp is_subsequence?(_, []) do
    false
  end

  defp is_subsequence?([s_h | s_t] = s, [t_h | t_t]) do
    if s_h == t_h do
      is_subsequence?(s_t, t_t)
    else
      is_subsequence?(s, t_t)
    end
  end
end
