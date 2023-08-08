defmodule Solution do
  @spec find_subarrays(nums :: [integer]) :: boolean
  def find_subarrays(nums) do
    chunked_nums = Enum.chunk_every(nums, 2, 1)

    chunked_nums
    |> List.delete_at(length(chunked_nums) - 1)
    |> Enum.map(&Enum.sum/1)
    |> Enum.frequencies()
    |> Enum.find_value(false, &(elem(&1, 1) >= 2 and true))
  end
end
