defmodule Solution do
  @spec single_number(nums :: [integer]) :: integer
  def single_number(nums) do
    nums
    |> Enum.group_by(& &1)
    |> Enum.find_value(fn
      {num, [_]} -> num
      {_, _} -> false
    end)
  end
end
