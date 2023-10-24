defmodule Solution do
  @spec diagonal_sum(mat :: [[integer]]) :: integer
  def diagonal_sum(mat) do
    length = length(mat)

    mat
    |> Enum.with_index()
    |> Enum.reduce(0, fn {row, i}, acc ->
      if rem(length, 2) == 1 and div(length, 2) == i do
        acc + Enum.at(row, i)
      else
        acc + Enum.at(row, i) + Enum.at(row, length - 1 - i)
      end
    end)
  end
end
