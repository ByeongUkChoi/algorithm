defmodule Solution do
  @spec get_row(row_index :: integer) :: [integer]
  def get_row(0) do
    [1]
  end

  def get_row(1) do
    [1, 1]
  end

  def get_row(row_index) do
    [1 | get_row(row_index - 1) |> Enum.chunk_every(2, 1) |> Enum.map(&Enum.sum/1)]
  end
end
