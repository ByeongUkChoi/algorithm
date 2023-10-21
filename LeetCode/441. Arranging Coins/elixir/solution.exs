defmodule Solution do
  @spec arrange_coins(n :: integer) :: integer
  def arrange_coins(n) do
    reduce_coins(n)
  end

  defp reduce_coins(step \\ 1, remain_coins)

  defp reduce_coins(step, remain_coins) do
    if step <= remain_coins do
      reduce_coins(step + 1, remain_coins - step)
    else
      step - 1
    end
  end
end
