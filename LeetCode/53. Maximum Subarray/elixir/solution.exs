defmodule Solution do
  @spec max_sub_array(nums :: [integer]) :: integer
  def max_sub_array([h | t]) do
    t
    |> Enum.reduce({h, h}, fn num, {acc, max} ->
      new_acc = max(num + acc, num)
      {new_acc, max(max, new_acc)}
    end)
    |> elem(1)
  end
end
