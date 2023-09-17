defmodule Solution do
  @spec generate(num_rows :: integer) :: [[integer]]
  def generate(num_rows) do
    1..num_rows
    |> Enum.reduce([[1]], fn _, acc ->
      [[1 | hd(acc) |> Enum.chunk_every(2, 1) |> Enum.map(&Enum.sum/1)] | acc]
    end)
    |> tl()
    |> Enum.reverse()
  end
end
