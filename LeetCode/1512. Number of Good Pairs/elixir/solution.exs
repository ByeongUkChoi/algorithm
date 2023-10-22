defmodule Solution do
  @spec num_identical_pairs(nums :: [integer]) :: integer
  def num_identical_pairs(nums) do
    nums
    |> Enum.frequencies()
    |> Enum.reduce(0, fn {_, v}, acc ->
      if v >= 2 do
        acc + trunc(v * (v - 1) / 2)
      else
        acc
      end
    end)
  end
end
