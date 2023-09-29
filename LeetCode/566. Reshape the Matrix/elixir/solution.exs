defmodule Solution do
  @spec matrix_reshape(mat :: [[integer]], r :: integer, c :: integer) :: [[integer]]
  def matrix_reshape(mat, r, c) do
    flatten_mat = Enum.flat_map(mat, & &1)

    if length(flatten_mat) == r * c do
      flatten_mat |> Enum.chunk_every(c)
    else
      mat
    end
  end
end
