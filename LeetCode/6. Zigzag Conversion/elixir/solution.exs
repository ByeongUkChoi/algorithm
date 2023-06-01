defmodule Solution do
  @spec convert(s :: String.t, num_rows :: integer) :: String.t
  def convert(s, 1) do
    s
  end

  def convert(s, num_rows) do
    chunk_size = (num_rows - 1) * 2

    s
    |> String.codepoints()
    |> Enum.chunk_every(chunk_size)
    |> Enum.map(fn [h | tail] ->
      [[h]] ++
        if num_rows > 2 do
          Enum.map(1..(num_rows - 2), fn i ->
            [Enum.at(tail, i - 1), Enum.at(tail, chunk_size - (i + 1))]
          end)
        else
          []
        end ++
        [[Enum.at(tail, num_rows - 2)]]
    end)
    |> Enum.zip_with(& &1)
    |> Enum.reduce("", fn x, acc ->
      acc <> (Enum.flat_map(x, & &1) |> Enum.join())
    end)
  end
end
