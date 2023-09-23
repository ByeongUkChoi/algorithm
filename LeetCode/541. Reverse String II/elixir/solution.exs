defmodule Solution do
  @spec reverse_str(s :: String.t(), k :: integer) :: String.t()
  def reverse_str(s, k) do
    s
    |> to_charlist()
    |> Enum.chunk_every(k)
    |> Enum.with_index()
    |> Enum.map(fn {chars, i} ->
      if rem(i, 2) == 0 do
        Enum.reverse(chars)
      else
        chars
      end
    end)
    |> Enum.join()
  end
end
