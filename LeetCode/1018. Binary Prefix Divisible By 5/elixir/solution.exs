defmodule Solution do
  @spec prefixes_div_by5(nums :: [integer]) :: [boolean]
  def prefixes_div_by5(nums) do
    nums
    |> Enum.reduce({0, []}, fn num, {prev, acc} ->
      new_acc = prev * 2 + num
      {new_acc, [rem(new_acc, 5) == 0 | acc]}
    end)
    |> elem(1)
    |> Enum.reverse()
  end
end
