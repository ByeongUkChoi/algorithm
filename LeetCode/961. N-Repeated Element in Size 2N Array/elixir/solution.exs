defmodule Solution do
  @spec repeated_n_times(nums :: [integer]) :: integer
  def repeated_n_times(nums) do
    nums |> Enum.frequencies() |> Enum.find_value(&(elem(&1, 1) > 1 and elem(&1, 0)))
  end
end
